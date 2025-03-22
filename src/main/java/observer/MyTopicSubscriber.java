package observer;

public class MyTopicSubscriber implements Observer{
    private String name;// tên observer
    private Subject topic;// chủ đề observer đang theo dõi

    public MyTopicSubscriber(String nm) {
        this.name=nm;
    }

    @Override
    public void update() {
        String msg= (String) topic.getUpdate(this);
        if(msg == null) {
            System.out.println(name+":: No new message");
        } else {
            System.out.println(name+":: Consuming message::"+msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        // TODO Auto-generated method stub
        this.topic=subject;
    }

    


}
