package observer;

import java.util.ArrayList;

public class main {

    public static void main(String[] args){
        UndoableStringBuilder usb = new UndoableStringBuilder();
        ArrayList<ConcreteMember> customers = new ArrayList<>();

        ConcreteMember m1 = new ConcreteMember(usb);
        ConcreteMember m2 = new ConcreteMember(usb);
        ConcreteMember m3 = new ConcreteMember(usb);
        ConcreteMember m4 = new ConcreteMember(usb);
        customers.add(m1);
        customers.add(m2);
        customers.add(m3);
        customers.add(m4);

        GroupAdmin admin = new GroupAdmin();
        System.out.println();
        System.out.println(JvmUtilities.jvmInfo());
        System.out.println();
        admin.append("to be or not to be") ;
        System.out.println(admin.usb) ;
        System.out.println("members:");
        for(ConcreteMember m:customers){
            System.out.println(m.usb);
        }
        System.out.println();
        System.out.println(JvmUtilities.jvmInfo());
        System.out.println();
        admin.usb.replace(3, 5, null) ;
        System.out.println(admin.usb) ;
        System.out.println("members:");
        for(ConcreteMember m:customers){
            System.out.println(m.usb);
        }
        System.out.println();
        System.out.println(JvmUtilities.jvmInfo());
        System.out.println();
        admin.usb.replace(17, 19, "eat") ;
        System.out.println(admin.usb) ;
        System.out.println("members:");
        for(ConcreteMember m:customers){
            System.out.println(m.usb);
        }
        System.out.println();
        System.out.println(JvmUtilities.jvmInfo());
        System.out.println();
        admin.usb.reverse();
        System.out.println(admin.usb) ;
        System.out.println("members:");
        for(ConcreteMember m:customers){
            System.out.println(m.usb);
        }
        System.out.println();
        System.out.println(JvmUtilities.jvmInfo());
        System.out.println();
        System.out.println();
        admin.undo();
        System.out.println(admin.usb);
        System.out.println("members:");
        for(ConcreteMember m:customers){
            System.out.println(m.usb);
        }
        System.out.println();
        System.out.println(JvmUtilities.jvmInfo());
        System.out.println();
        admin.undo();
        System.out.println(admin.usb);
        System.out.println("members:");
        for(ConcreteMember m:customers){
            System.out.println(m.usb);
        }
        System.out.println();
        System.out.println(JvmUtilities.jvmInfo());
        System.out.println();
        admin.undo();
        System.out.println(admin.usb);
        System.out.println("members:");
        for(ConcreteMember m:customers){
            System.out.println(m.usb);
        }
        admin.unregister(m1);
        System.out.println();
        System.out.println(JvmUtilities.jvmInfo());
        System.out.println();
        admin.undo();
        admin.undo();
        System.out.println(admin.usb);
        System.out.println("members:");
        for(ConcreteMember m:customers){
            System.out.println(m.usb);
        }
        System.out.println();
        System.out.println(JvmUtilities.jvmInfo());
        System.out.println();
    }
}
