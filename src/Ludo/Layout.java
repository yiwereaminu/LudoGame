package Ludo;

import java.awt.*;

public class Layout {

    int x, y, width, height;

    public Layout(int xi, int yi) {
        x = xi;
        y = yi;
        width = 30;
        height = 30;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 15 * width, 15 * height);

        for (int i = 1; i < 5; i++) {
            g.setColor(Color.YELLOW);
            g.fillArc(x + 30 + (i * width), y + (7 * height), width - 5, height - 5, 0, 360);
            g.setColor(Color.GREEN);
            g.fillArc(x + ((8 + i) * width), y + (7 * height), width - 5, height - 5, 0, 360);
            g.setColor(Color.BLUE);
            g.fillArc(x + (7 * width), y + 30 + (i * height), width - 5, height - 5, 0, 360);
            g.setColor(Color.RED);
            g.fillArc(x + ((7) * width), y + ((8 + i) * height), width - 5, height - 5, 0, 360);
        }

        int temp1 = x + 45, temp2 = y + 45;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                g.setColor(Color.YELLOW);
                g.fillArc(temp1 + (2 * i * width), temp2 + (2 * j * height), width, height, 0, 360);
                g.setColor(Color.GREEN);
                g.fillArc(temp1 + (2 * i * width) + 9 * width, temp2 + (2 * j * height) + 9 * height, width, height, 0, 360);
                g.setColor(Color.BLUE);
                g.fillArc(temp1 + (2 * i * width) + 9 * width, temp2 + (2 * j * height) + 0 * height, width, height, 0, 360);
                g.setColor(Color.RED);
                g.fillArc(temp1 + (2 * i * width) + 0 * width, temp2 + (2 * j * height) + 9 * height, width, height, 0, 360);
                g.setColor(Color.BLACK);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                g.drawArc(x + ((i + 6) * width), y + 30 + (j * height), width - 5, height - 5, 0, 360);
                g.drawArc(x + 30 + ((j) * width), y + ((i + 6) * height), width - 5, height - 5, 0, 360);
                g.drawArc(x + ((i + 6) * width), y + ((j + 9) * height), width - 5, height - 5, 0, 360);
                g.drawArc(x + ((j + 9) * width), y + ((i + 6) * height), width - 5, height - 5, 0, 360);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                g.drawRect(temp1 + (2 * i * width), temp2 + (2 * j * height), width, height);
                g.drawRect(temp1 + (2 * i * width) + 9 * width, temp2 + (2 * j * height) + 9 * height, width, height);
                g.drawRect(temp1 + (2 * i * width) + 9 * width, temp2 + (2 * j * height) + 0 * height, width, height);
                g.drawRect(temp1 + (2 * i * width) + 0 * width, temp2 + (2 * j * height) + 9 * height, width, height);
            }
        }

        g.setFont(new Font("serif", Font.BOLD, 40));
        g.drawString("Player 1", 90, 35);
        g.drawString("Player 2", 370, 35);
        g.drawString("Player 4", 90, 540);
        g.drawString("Player 3", 370, 540);
        g.drawString("Instruction:", 550, 300);
        g.drawString("1.Press enter to roll dice.", 550, 350);
        g.drawString("2.Click on coin to move.", 550, 400);
    }
}
