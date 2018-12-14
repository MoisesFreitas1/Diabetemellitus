package losfreitasapps.com.diabetemellitus.Models;

/**
 * Created by Moises on 06/02/17.
 */

public class Question {

    private Long id;
    private String enunciado;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int gabarito;

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
            this.a = a;
        }

    public String getB() {
            return b;
        }

    public void setB(String b) {
            this.b = b;
        }

    public String getC() {
            return c;
        }

    public void setC(String c) {
            this.c = c;
        }

    public String getD() {
            return d;
        }

    public void setD(String d) {
            this.d = d;
        }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public int getGabarito() {
        return gabarito;
    }

    public void setGabarito(int gabarito) {
        this.gabarito = gabarito;
    }
}
