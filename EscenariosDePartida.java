

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class escenariosDePartida.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class escenariosDePartida
{
    private MailServer gmailServer;
    private MailClient clientePepe;
    private MailClient clienteMaria;

    /**
     * Default constructor for test class escenariosDePartida
     */
    public escenariosDePartida()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        gmailServer = new MailServer();
        clientePepe = new MailClient(gmailServer, "pepe@gmail.com");
        clienteMaria = new MailClient(gmailServer, "maria@gmail.com");
        clientePepe.sendMailItem("maria@gmail.com", "Hola María");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
