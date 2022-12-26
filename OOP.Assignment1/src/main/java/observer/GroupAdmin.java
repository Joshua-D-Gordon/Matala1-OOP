package observer;

import java.util.ArrayList;

public class GroupAdmin implements Sender{
    ArrayList<ConcreteMember> customers;
    UndoableStringBuilder usb;
    public GroupAdmin(){
        this.customers = new ArrayList<>();
        this.usb = new UndoableStringBuilder();
    }
    @Override
    public void register(Member obj) {
        this.customers.add((ConcreteMember) obj);
    }

    @Override
    public void unregister(Member obj) {
        this.customers.remove((ConcreteMember) obj);
    }

    @Override
    public void insert(int offset, String obj) {
        this.usb.insert(offset, obj);
        for(Member m:customers){
            m.update(this.usb);
        }
    }

    @Override
    public void append(String obj) {
        this.usb.append(obj);
        for(Member m:customers){
            m.update(this.usb);
        }
    }

    @Override
    public void delete(int start, int end) {
        this.usb.delete(start, end);
        for(Member m:customers){
            m.update(this.usb);
        }
    }

    @Override
    public void undo() {
        this.usb.undo();
        for(Member m:customers){
            m.update(this.usb);
        }
    }
}
