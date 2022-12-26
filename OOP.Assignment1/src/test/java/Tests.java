import observer.ConcreteMember;
import observer.GroupAdmin;
import observer.Member;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class Tests {
    public static final Logger logger = LoggerFactory.getLogger(Tests.class);
    // stub method to check external dependencies compatibility
    @Test
    public void test(){
        //making group admin
        GroupAdmin admin = new GroupAdmin();
        //making members m1-m4
        Member m1 = new ConcreteMember(), m2 = new ConcreteMember(), m3 = new ConcreteMember(), m4 = new ConcreteMember();
        //printing ONE members info
        System.out.println("PRINTING ONE MEMBERS INFO");
        logger.info(()->JvmUtilities.objectFootprint(m1));

        logger.info(()->JvmUtilities.objectTotalSize(m1));

        logger.info(() -> JvmUtilities.jvmInfo());
        //priinting admins JVM info
        System.out.println("PRINTING JVM INFO BEFORE ADDING ADMIN");
        logger.info(()->JvmUtilities.objectFootprint(admin));

        logger.info(()->JvmUtilities.objectTotalSize(admin));

        logger.info(() -> JvmUtilities.jvmInfo());

        //regestering members m1-m4 on admins customer list
        admin.register(m1);
        admin.register(m2);
        admin.register(m3);
        admin.register(m4);
        System.out.println("PRINTING JVM INFO AFTER ADDING MEMBERS");
        //priinting admins JVM info
        logger.info(()->JvmUtilities.objectFootprint(admin));

        logger.info(()->JvmUtilities.objectTotalSize(admin));

        logger.info(() -> JvmUtilities.jvmInfo());
        admin.append("to be or not to be");
        //check all memebrs have been updated



        System.out.println("PRINTING JVM INFO AFTER APPENDING TO ADMIN");
        logger.info(()->JvmUtilities.objectFootprint(admin));

        logger.info(()->JvmUtilities.objectTotalSize(admin));

        logger.info(() -> JvmUtilities.jvmInfo());
        System.out.println("PRINTING JVM INFO OF ONE MEMBER AFTER APPENDING STRING TO ADMIN");
        logger.info(()->JvmUtilities.objectFootprint(m1));

        logger.info(()->JvmUtilities.objectTotalSize(m1));

        logger.info(() -> JvmUtilities.jvmInfo());

        admin.unregister(m2);
        System.out.println("PRINTING JVM INFO AFTER removing M2");
        logger.info(()->JvmUtilities.objectFootprint(admin));

        logger.info(()->JvmUtilities.objectTotalSize(admin));

        logger.info(() -> JvmUtilities.jvmInfo());

    }
}
