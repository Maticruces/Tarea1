public interface ComparableMoneda{
    private int valor;
    private int numeroSerie;
    // Constructor, getters y setters
    public int compareTo(Moneda otraMoneda) {

        if (this.valor < otraMoneda.valor) return -1;

        else if (this.valor > otraMoneda.valor) return 1;

        else return 0;
    }
}