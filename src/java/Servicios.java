
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import java.sql.SQLException;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.ExecutorService;

@ApplicationPath("")
@Path("/Recursos-SA")
public class Servicios extends Application {

    private ExecutorService executorService = java.util.concurrent.Executors.newCachedThreadPool();

    @GET
    @Path("/ConsultarMesaDPI")
    @Produces({MediaType.APPLICATION_XML})
    public String ConsultarMesaPorDPI() throws SQLException {
        return "<DPI>1</DPI>";
    }

}
