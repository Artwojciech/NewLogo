package DrawingTools;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrawingPanel extends JPanel {

    private int x; // Aktualna pozycja x kursora
    private int y; // Aktualna pozycja y kursora
    private double angle; // Aktualny kąt (w radianach)
    private final int unitLength = 10; // Jednostka długości
    private Color lineColor = Color.BLACK; // Domyślny kolor linii
    private int lineWidth = 1; // Domyślna szerokość linii
    private Color backgroundColor = Color.WHITE; // Domyślny kolor tła

    // Lista najpopularniejszych kolorów
    private static final List<Color> popularColors = Arrays.asList(
            Color.BLACK, Color.WHITE, Color.RED, Color.GREEN, Color.BLUE,
            Color.YELLOW, Color.MAGENTA, Color.PINK, Color.ORANGE, Color.GRAY
    );

    // Lista przechowująca linie do narysowania
    private List<Line> lines = new ArrayList<>();

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
        commandField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = commandField.getText();
                commandField.setText("");
                processCommand(panel, command);
            }
        });

        // Konfiguracja ramki
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Ustawienie ramki na środku ekranu
        frame.setVisible(true);

        return panel;
    }

    private static void processCommand(DrawingPanel panel, String command) {
        // Przetwarzanie wprowadzonych poleceń
        if (command.startsWith("forward")) {
            panel.forward();
        } else if (command.startsWith("rturn")) {
            try {
                double angle = Double.parseDouble(command.split(" ")[1]);
                panel.rturn(angle);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                System.out.println("Błędny format polecenia rturn");
            }
        } else if (command.startsWith("lturn")) {
            try {
                double angle = Double.parseDouble(command.split(" ")[1]);
                panel.lturn(angle);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                System.out.println("Błędny format polecenia lturn");
            }
        } else if (command.startsWith("linecol")) {
            try {
                String colorName = command.split(" ")[1].toUpperCase();
                Color color = (Color) Color.class.getField(colorName).get(null);
                panel.linecol(color);
            } catch (Exception ex) {
                System.out.println("Błędny kolor");
            }
        } else if (command.startsWith("linewidth")) {
            try {
                int width = Integer.parseInt(command.split(" ")[1]);
                panel.linewidth(width);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                System.out.println("Błędny format polecenia linewidth");
            }
        } else if (command.startsWith("changeback")) {
            try {
                String colorName = command.split(" ")[1].toUpperCase();
                Color color = (Color) Color.class.getField(colorName).get(null);
                panel.changeback(color);
            } catch (Exception ex) {
                System.out.println("Błędny kolor");
            }
        } else if (command.startsWith("clear")) {
            panel.clear();
        } else {
            System.out.println("Nieznane polecenie");
        }
    }

    public void forward() {
        // Obliczenie nowej pozycji kursora
        int newX = x + (int) (unitLength * Math.cos(angle));
        int newY = y - (int) (unitLength * Math.sin(angle)); // Ujemne, ponieważ oś Y rośnie w dół

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
        // Sprawdzanie, czy kolor jest na liście popularnych kolorów
        if (popularColors.contains(color)) {
            this.lineColor = color;
        } else {
            System.out.println("Nieprawidłowy kolor. Użyj jednego z najpopularniejszych kolorów.");
        }
    }

    public void linewidth(int width) {
        if (width > 0) {
            this.lineWidth = width;
        } else {
            System.out.println("Szerokość linii musi być dodatnia.");
        }
    }

    public void changeback(Color color) {
        // Sprawdzanie, czy kolor jest na liście popularnych kolorów
        if (popularColors.contains(color)) {
            this.backgroundColor = color;
            this.setBackground(color); // Zmiana koloru tła panelu
        } else {
            System.out.println("Nieprawidłowy kolor. Użyj jednego z najpopularniejszych kolorów.");
        }
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
        for (Line line : lines) {
            g2.setColor(line.color);
            g2.setStroke(new BasicStroke(line.width));
            g2.drawLine(line.x1, line.y1, line.x2, line.y2);
        }
    }

    public static void main(String[] args) {
        DrawingPanel panel = createPanel(400, 400);
    }
}


