// Essa classe ira adicionar uma imagem ao nosso plano de fundo d
// nosso plano de fundo da tela principal...
package classes;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class Background extends JDesktopPane {

    private Image imagem;

    public Background() {
    }

    public Background(String img) {
        if (img!= null) {
            imagem = new ImageIcon(getClass().getResource(img)).getImage();
        }
    }

    public Background(Image imagenInicial) {
        if (imagenInicial != null) {
            imagem = imagenInicial;
        }
    }

    public void setImagen(String img) {
        if (img != null) {
            imagem = new ImageIcon(getClass().getResource(img)).getImage();
        } else {
            imagem = null;
        }

        repaint();
    }

    public void setImagen(Image novaImagem) {
        imagem = novaImagem;

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        if (imagem != null) {
            g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
        } else{
            setOpaque(true);
        }

        super.paint(g);
    }
}
