package proyectoexists2;

//CAMBIAR RUTAS
//segundo ejercicio usando eXists
import java.io.File;
import java.util.Iterator;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.Resource;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.CollectionManagementService;
import org.xmldb.api.modules.XPathQueryService;

public class ProyectoExists2 {

    public static String driver = "org.exist.xmldb.DatabaseImpl";

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, XMLDBException {

        //CONEXION
        Class<?> cl = Class.forName(driver);
        Database database = (Database) cl.newInstance();
        DatabaseManager.registerDatabase(database);
        //Aquí podemos meter la ruta de la colección a la que queremos acceder
        String coleccion = "/db/cosas";
        Collection col;
        String uri = "xmldb:exist://localhost:8080/exist/xmlrpc";
        col = DatabaseManager.getCollection(uri + coleccion, "admin", "oracle");

        //Servicios:
        XPathQueryService servicioXPQS = (XPathQueryService) col.getService("XPathQueryService", "1.0");

        //INSERTAR <PERSONA> LLAMADA "ALEXIA" EN PROBA.XML
//
//        String elemento1 = "update insert <PERSONA>Alexia</PERSONA> into /PLAY/PERSONAE";
//
//        servicioXPQS.queryResource("proba.xml", elemento1);
        //INSERTAR <PERSONA> LLAMADA "SARA" EN TODOS LOS RECURSOS DE LA COLECCIÓN COSAS
        //CUANDO INSERTAMOS EN TODOS LOS RECURSOS DE UNA COLECCIÓN, PUEDE QUE NO AFECTE EL CAMBIO A TODOS
        //YA QUE PUEDE QUE ALGÚN DOCUMENTO NO TENGA ESA RUTA QUE LE ESPECIFICAMOS
        //POR EJEMPLO, EN ESTE CASO LA RUTA EXISTIRÁ EN PROBA.XML Y PROBA2.XML, PERO NO EN EMPLEADOS.XML
        //EN EL "INTO" USAMOS UNA RUTA XPATH
//        String elemento2 = "update insert <PERSONA>Sara</PERSONA> into //PERSONAE" ;
//        
//        servicioXPQS.query(elemento2);
//        
        //modificar o <APELLIDO> do empregado que ten por <EMP_NO> o valor 7521  para que pase a apelidarse 'BIEITEZ'
//        String elemento3 = "update value /EMPLEADOS/EMP_ROW[EMP_NO=7521]/APELLIDO with 'BIEITEZ'";
//
//        servicioXPQS.queryResource("empleados.xml", elemento3);
//       
        //eliminar o empregado de que ten por <EMP_NO> o valor 7698
//        
//        String elemento4 ="update delete /EMPLEADOS/EMP_ROW[EMP_NO=7698]";
//        
//        servicioXPQS.queryResource("empleados.xml", elemento4);
//        
        //modificar a <persona> chamada 'pedro'  para que pase a chamarse 'xoan' no documento proba2.xml
        
        //MAL cambia los 2?????? 
//        String elemento5 = "update value /PLAY/PERSONAE[PERSONA = 'pedro']/PERSONA with 'xoan'";
//        
//        servicioXPQS.queryResource("proba2.xml",elemento5);
//        
        //modificar a <persona> chamada 'luis'  para que pase a chamarse 'xulio' no documento proba.xml
        
        
//
        //modificar a <persona> chamada 'xoan'  para que pase a chamarse 'sara' en todos oo documentos da coleción 'cousas'
        
        
//
        //modificar o <nome>  'ana' de do <p id="2">  para que pase a chamarse 'xulia'  no documento proba.xml
        
        
        
        
        
        
        
        
    }

}
