import java.util.ArrayList;
import java.util.List;

public class tarjeta_credito {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompra;

    public tarjeta_credito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompra = new ArrayList<>();
    }

    public boolean lanzarcompra(Compra compra){
        if (this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompra.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite(){
        return limite;
    }

    public double getsaldo() {
        return saldo;
    }
    public List<Compra> getListaDeCompra() {
        return listaDeCompra;
    }


}
