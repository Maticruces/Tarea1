class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private Deposito super8;
    private Deposito rallita;
    private DepositoM monVu;
    private  int precio;
    public static final int  COCA = 1;
    public static final int  SPRITE = 2;
    public static final int SUPER8 = 3;
    public static final int RALLITA = 4;
    public Expendedor(int numProductos, int precioProductos) {
        coca = new Deposito();
        sprite = new Deposito();
        super8 = new Deposito();
        rallita = new Deposito;
        monVu = new DepositoM();
        precio = precioProductos;

        for (int i = 0; i < numProductos; i++) {
            Producto cc = new CocaCola(100 + i);
            coca.addProducto(cc);

            Producto sp = new Sprite(200 + i);
            sprite.addProducto(sp);

            Producto s8 = new Super8( 250 + i);
            super8.addProducto(s8);

            Producto rt = new Rallita( 300 * i);
            rallita.addProducto(rt);
        }
    }
