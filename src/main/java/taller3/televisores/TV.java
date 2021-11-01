package taller3.televisores;

public class TV {
    private static int numTV;

    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static int getNumTV() {
        return numTV;
    }

    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp() {
        if (1 <= this.canal && this.canal <= 120 && this.estado) {
            canal++;
        }
    }

    public void canalDown() {
        if (1 <= this.canal && this.canal <= 120 && this.estado) {
            canal--;
        }
    }

    public void volumenUp() {
        if (0 <= this.volumen && this.volumen <= 7 && this.estado) {
            volumen++;
        }
    }

    public void volumenDown() {
        if (0 <= this.volumen && this.volumen <= 7 && this.estado) {
            volumen--;
        }
    }
}
