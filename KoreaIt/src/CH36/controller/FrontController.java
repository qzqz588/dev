package CH36.controller;
import javax.swing.text.DefaultEditorKit;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FrontController {

    private Map<String,SubController> map = new HashMap();

    public FrontController(){
        System.out.println("[FC] FrontController()....");
        init();

    }
    private void init(){
        System.out.println("[FC] init()....");
        //요청 API에 따른 SubController 저장
        map.put("/book", new BookController());
        map.put("/user", new UserController());
    }//View - 로부터의 요청 처리
    public Map<String, Object> execute (Map<String,Object>params){
        //endPoint
        System.out.println("[FC] execute()....");
        String endPoint = (String)params.get("endPoint"); //사용자의 요청 EP를 확인(/book,/user)
        SubController controller = map.get(endPoint);
        return controller.execute(params);// 요청사항을 처리할 SubController get
    }
}
