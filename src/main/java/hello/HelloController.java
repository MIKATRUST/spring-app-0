package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        String style = "<style type='text/css' media='screen'>";
        style += "body { background-color:green ; position: fixed; top: 50%; left: 50%; transform: translate(-50%, -50%); color: white; font-size: 250%; }";
        style += "</style>";
        
        // TODO - Personalize this message!
        String message = "Hello 1042";
        //#6DB23E
        
        String body = "<body>" + message + "</body>";

        return style + body;
    }

}
