/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lb;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import views.CadastroLogin;
import views.TelaLogin;

/**
 *
 * @author André Rian
 */
public class Imagem {
    
    public boolean deletarImagem(String caminho) {
        File deletar = new File(caminho);
        return deletar.delete();

    }
    
    public static void salvaImagem(String nomeDaImagem,String caminhoDaImagem, String nomeDaPasta, byte [] imagemByte) {

        File criarPasta = new File(nomeDaPasta);
        FileOutputStream fos;
        try {
            if (!criarPasta.exists()) { // testa se a pasta ja existe 
                criarPasta.mkdir(); // criar pasta caso nao existe
            }

            fos = new FileOutputStream(caminhoDaImagem +"/"+ nomeDaImagem);
            fos.write(imagemByte);

        } catch (FileNotFoundException ex) {
           throw  new RuntimeException("Erro ao salva a imagem na pasta "+ ex.getMessage());
        } catch (IOException ex) {
            throw  new RuntimeException("Erro ao salva a imagem na pasta "+ ex.getMessage());
        }

    }

    public static void colocarImagemLabel(JLabel label, byte[] imagemArryByte) {

        ImageIcon imagemIcone = new ImageIcon(imagemArryByte);
        Image imagemFormatada = imagemIcone.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT);
        label.setIcon(new ImageIcon(imagemFormatada));

    }
    

    public static void colocarImagemLabel(JLabel label, BufferedImage bufferedImage) {

        ImageIcon imagemIcone = new ImageIcon(bufferedImage);
        Image imagemFormatada = imagemIcone.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT);
        label.setIcon(new ImageIcon(imagemFormatada));

    }

    public byte[] coverteImagemEmArryByte(BufferedImage bufferedImage) {
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(bufferedImage, "jpg", baos);
            baos.flush();
            byte[] imageInByte = baos.toByteArray();
            baos.close();
            return imageInByte;
        } catch (IOException ex) {
            throw new RuntimeException("Erro ao coverter a bufferedImage para Arry de byte!");
        }

    }

    public byte[] coverterImagemEmArryDeByte(File arquivo) {

        FileInputStream fis;

        byte[] conteudoByte = new byte[(int) arquivo.length()];

        try {

            fis = new FileInputStream(arquivo);
            fis.read(conteudoByte);
            fis.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CadastroLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CadastroLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conteudoByte;

    }

    public BufferedImage coverterParaBufferedImage(byte[] imageData) {

        ByteArrayInputStream coteudoBytes = new ByteArrayInputStream(imageData);
        try {
            return ImageIO.read(coteudoBytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public BufferedImage coverterParaBufferedImage(String caminhoDaImagem) {

        BufferedImage imagemCovertida = null;
        try {
            Image image = ImageIO.read(new File(caminhoDaImagem).getCanonicalFile());
            imagemCovertida = (BufferedImage) image;

        } catch (IOException ex) {
            throw new RuntimeException("Imagem não encontrada!");
        }

        return imagemCovertida;

    }

}
