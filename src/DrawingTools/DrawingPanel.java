package DrawingTools;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawingPanel extends JPanel {

    private int x; // Aktualna pozycja x kursora
    private int y; // Aktualna pozycja y kursora
    private double angle; // Aktualny kąt (w radianach)
    private final int unitLength = 1; // Jednostka długości
    private Color lineColor = Color.BLACK; // Domyślny kolor linii
    private int lineWidth = 1; // Domyślna szerokość linii
    private Color backgroundColor = Color.WHITE; // Domyślny kolor tła
    

    // Lista przechowująca linie do narysowania
    private final List<Line> lines = new ArrayList<>();

    // Klasa pomocnicza do przechowywania informacji o liniach
    private static class Line {
        int x1, y1, x2, y2;
        Color color;
        int width;

        Line(int x1, int y1, int x2, int y2, Color color, int width) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.color = color;
            this.width = width;
        }
    }

    public DrawingPanel(int width, int height) {
        // Ustawienie wymiarów panelu
        this.setPreferredSize(new Dimension(width, height));

        // Ustawienie kursora na środku panelu
        this.x = width / 2;
        this.y = height / 2;
        this.angle = 0; // Początkowy kierunek to "prawo"
    }

    public static DrawingPanel createPanel(int width, int height) {
        // Tworzenie ramki
        JFrame frame = new JFrame("Drawing Panel");

        // Tworzenie panelu i ustawienie kursora na środku
        DrawingPanel panel = new DrawingPanel(width, height);

        // Dodanie panelu do ramki
        frame.add(panel, BorderLayout.CENTER);

        // Tworzenie pola tekstowego do wprowadzania poleceń
        JTextField commandField = new JTextField();
        frame.add(commandField, BorderLayout.SOUTH);

        // Dodanie ActionListener do pola tekstowego
        commandField.addActionListener(_ -> {
            String input = commandField.getText();
            String command = input.substring(0, input.indexOf("("));
            String arguments = input.substring(input.indexOf("(")+1, input.length()-1);
            if(arguments.startsWith("\"")) arguments = arguments.substring(1, arguments.length()-1);
            commandField.setText("");
            processCommand(panel, command, arguments);
        });

        // Konfiguracja ramki
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Ustawienie ramki na środku ekranu
        frame.setVisible(true);

        return panel;
    }

    public static void processCommand(DrawingPanel panel, String command, String arguments) {
        // Przetwarzanie wprowadzonych poleceń
        if (command.startsWith("forward")) {
            try {
                double distance = Double.parseDouble(arguments);
                panel.forward(distance);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                System.out.println("Błędny format polecenia forward");
            }
        } else if (command.startsWith("rturn")) {
            try {
                double angle = Double.parseDouble(arguments);
                panel.rturn(angle);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                System.out.println("Błędny format polecenia rturn");
            }
        } else if (command.startsWith("lturn")) {
            try {
                double angle = Double.parseDouble(arguments);
                panel.lturn(angle);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                System.out.println("Błędny format polecenia lturn");
            }
        } else if (command.startsWith("linecol")) {
            try {
                String colorName = arguments.toUpperCase();
                Color color = (Color) Color.class.getField(colorName).get(null);
                panel.linecol(color);
            } catch (Exception ex) {
                System.out.println("Błędny kolor");
            }
        } else if (command.startsWith("linewidth")) {
            try {
                int width = Integer.parseInt(arguments);
                panel.linewidth(width);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                System.out.println("Błędny format polecenia linewidth");
            }
        } else if (command.startsWith("changebg")) {
            try {
                String colorName = arguments.toUpperCase();
                Color color = (Color) Color.class.getField(colorName).get(null);
                panel.changebg(color);
            } catch (Exception ex) {
                System.out.println("Błędny kolor");
            }
        } else if (command.startsWith("clear")) {
            panel.clear();
        } else {
            System.out.println("Nieznane polecenie");
        }
    }

    public void forward(double distance) {
        // Obliczenie nowej pozycji kursora
        int newX = x + (int) (unitLength * Math.cos(angle) * distance);
        int newY = y - (int) (unitLength * Math.sin(angle) * distance); // Ujemne, ponieważ oś Y rośnie w dół

        // Dodanie nowej linii do listy
        lines.add(new Line(x, y, newX, newY, lineColor, lineWidth));

        // Aktualizacja pozycji kursora
        x = newX;
        y = newY;

        // Odświeżenie panelu
        repaint();
    }

    public void rturn(double angle) {
        // Obrót kursora w prawo (dodatni kąt)
        this.angle -= Math.toRadians(angle);
    }

    public void lturn(double angle) {
        // Obrót kursora w lewo (ujemny kąt)
        this.angle += Math.toRadians(angle);
    }

    public void linecol(Color color) {
        this.lineColor = color;
    }

    public void linewidth(int width) {
        if (width > 0) {
            this.lineWidth = width;
        } else {
            System.out.println("Szerokość linii musi być dodatnia.");
        }
    }

    public void changebg(Color color) {
        this.backgroundColor = color;
        this.setBackground(color); // Zmiana koloru tła panelu
    }

    public void clear() {
        // Wyczyść listę linii
        lines.clear();

        // Odświeżenie panelu
        repaint();
    }
    public boolean isBorder() {
        int newX = x + (int) (unitLength * Math.cos(angle));
        int newY = y - (int) (unitLength * Math.sin(angle));

        return newX <= 0 || newX >= getWidth() || newY <= 0 || newY >= getHeight();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Ustawienie koloru tła
        this.setBackground(backgroundColor);

        // Rysowanie wszystkich linii
        Graphics2D g2 = (Graphics2D) g;
        for (Line line : new ArrayList<>(lines)) {
            g2.setColor(line.color);
            g2.setStroke(new BasicStroke(line.width));
            g2.drawLine(line.x1, line.y1, line.x2, line.y2);
        }
    }
}


