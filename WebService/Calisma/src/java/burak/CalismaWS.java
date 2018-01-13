/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burak;
import java.io.IOException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author USER
 */
@WebService(serviceName = "NewWebService")
public class CalismaWS {
    @WebMethod(operationName = "GetInsPic")
    public String GetInsPic(@WebParam(name = "name") String username) {
        String url ="http://www.instagram.com/"+username;
        String imageUrl="";
        try{
        Connection.Response response = Jsoup.connect(url).timeout(30000).execute();
        Document doc = (Document) response.parse();
        Element images = doc.select("meta[property=og:image]").first();
        imageUrl = images.attr("content");
        
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
    return imageUrl;       
    }
    
      @WebMethod(operationName = "GetTwitPic")
    public String GetTwitPic(@WebParam(name = "name") String username) {
        String url = "http://www.twitter.com/"+username;
        String imgURL="";
        try{
            Connection.Response response = Jsoup.connect(url).timeout(30000).execute();
            Document doc = (Document) response.parse();
            Element images = doc.select("img[class=\"ProfileAvatar-image\"]").first(); 
            imgURL=images.attr("src");
        }
        catch(IOException e){
            System.out.println(e.toString());
        }  
       return imgURL;
    }

}