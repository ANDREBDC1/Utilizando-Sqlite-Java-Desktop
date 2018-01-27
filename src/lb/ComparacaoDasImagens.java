/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lb;

/**
 *
 * @author André Rian
 */
import java.awt.image.BufferedImage;
import java.awt.image.Raster;

public class ComparacaoDasImagens {

    private int compareX;
    private int compareY;
    private int factorA;
    private int factorD;
    private boolean isParementos = false;

    public void setParamento(int comparex, int comparey, int factorA, int factorD) {

        this.compareX = comparex;
        this.compareY = comparey;
        this.factorA = factorA;
        this.factorD = factorD;
        this.isParementos = true;
    }

    private void setParamento() {
        this.compareX = 10;
        this.compareY = 10;
        this.factorA = 10;
        this.factorD = 10;
    }

    public boolean comparaImagens(BufferedImage imagem1, BufferedImage imagem2) {

        int larguraImage1 = imagem1.getWidth();
        int larguraImagen2 = imagem2.getWidth();
        int alturaImagem1 = imagem1.getHeight();
        int alturaImagem2 = imagem2.getHeight();

        if ((larguraImage1 != larguraImagen2) || (alturaImagem1 != alturaImagem2)) {
            return false;
        }

        for (int x = 0; x < larguraImage1; x++) {

            for (int y = 0; y < alturaImagem2; y++) {
                if (imagem1.getRGB(x, y) != imagem2.getRGB(x, y)) {
                    return false;
                }

            }

        }
        return true;
    }

    public boolean comparaImagem(BufferedImage imagem1, BufferedImage imagem2) {
        try {
            if (!isParementos) {
                setParamento();
            }

            int blocksx = (int) (imagem1.getWidth() / 10);
            int blocksy = (int) (imagem1.getHeight() / 10);

            for (int y = 0; y < compareY; y++) {

                for (int x = 0; x < compareX; x++) {
                    int b1 = getAverageBrightness(imagem1.getSubimage(x * blocksx, y * blocksy, blocksx - 1, blocksy - 1));
                    int b2 = getAverageBrightness(imagem2.getSubimage(x * blocksx, y * blocksy, blocksx - 1, blocksy - 1));
                    int diff = Math.abs(b1 - b2);
                    if (diff > factorA) {
                        return false;
                    }
                }
            }

            return true;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    protected int getAverageBrightness(BufferedImage img) {
        try {
            Raster r = img.getData();
            int total = 0;
            for (int y = 0; y < r.getHeight(); y++) {
                for (int x = 0; x < r.getWidth(); x++) {
                    total += r.getSample(r.getMinX() + x, r.getMinY() + y, 0);
                }
            }
            return (int) (total / ((r.getWidth() / factorD) * (r.getHeight() / factorD)));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
