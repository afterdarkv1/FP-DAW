package buscasMinas;

class Casilla {

    private boolean tieneMina;
    private boolean estaMarcada;
    private boolean estaOculta;
    private int numMinasCercanas;

    public Casilla() {
        this.tieneMina = false;
        this.estaMarcada = false;
        this.estaOculta = true;
        this.numMinasCercanas = 0;
    }

    public boolean isTieneMina() {
        return tieneMina;
    }

    public void setTieneMina(boolean tieneMina) {
        this.tieneMina = tieneMina;
        if (tieneMina)
            this.numMinasCercanas = 9;
    }

    public boolean isEstaMarcada() {
        return estaMarcada;
    }

    public void setEstaMarcada(boolean estaMarcada) {
        this.estaMarcada = estaMarcada;
    }

    public boolean isEstaOculta() {
        return estaOculta;
    }

    public void setEstaOculta(boolean estaOculta) {
        this.estaOculta = estaOculta;
    }

    public int getNumMinasCercanas() {
        return numMinasCercanas;
    }

    public void setNumMinasCercanas(int numMinasCercanas) {
        if (!tieneMina)
            this.numMinasCercanas = numMinasCercanas;
    }
}