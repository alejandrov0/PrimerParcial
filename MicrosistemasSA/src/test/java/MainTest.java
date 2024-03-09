import org.example.Cola;
import org.example.Main;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    Cola cola;
    Main Main;

    @Before
    public void init(){
        Main = new Main(cola) {
            @Override
            public void enqueue(String item) {
                
            }

            @Override
            public String deque() {
                return null;
            }

            @Override
            public String peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }
        };
        Main.ingresarPC("ABC123");
        Main.ingresarPC("CDE456");
        Main.ingresarPC("FGH789");
    }

    @Test
    public void testIngresarPC(){
        String jkl147 = Main.ingresarPC("JKL147");
        assert(Main.proximaPC().equals("ABC123"));
        assert(Main.obtenerPCEnCola()==4);
    }

    @Test
    public void testEntregarPC(){
        String entrega = Main.entregarPC();
        assert(entrega.equals("ABC123"));
        assert(Main.proximaPC().equals("CDE456"));
    }

}

