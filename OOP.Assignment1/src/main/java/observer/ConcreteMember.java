package observer;

public class ConcreteMember implements Member{
    UndoableStringBuilder usb;
    public ConcreteMember(UndoableStringBuilder usb){
        this.usb = usb;
    }
    @Override
    public void update(UndoableStringBuilder usb) {
        this.usb = usb;
    }
}
