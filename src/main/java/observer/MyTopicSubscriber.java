import observer.Observer;
import observer.Subject;

public class MyTopicSubscriber implements Observer{
    private String name;// tên observer
    private Subject topic;// chủ đề observer đang theo dõi

    public MyTopicSubscriber(String nm) {
        this.name=nm;
    }

    //gán sub cho observer
    @Override
    public void setSubject(Subject subject) {
        this.topic=sub;
        
    }
    //lấy thông báo từ chủ đề bằng getUpdate() và in ra màn hình
    @Override
    public void update(Subject sub) {
        String msg=  (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name+":: No new message");
        }else{
            System.out.println(name+":: Consuming message::"+msg);
        }
        
    }


}
