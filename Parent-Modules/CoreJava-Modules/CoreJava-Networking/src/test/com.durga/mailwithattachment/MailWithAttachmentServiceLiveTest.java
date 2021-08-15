package mailwithattachment;

import com.icegreen.greenmail.util.GreenMail;
import com.icegreen.greenmail.util.ServerSetupTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import javax.mail.Session;

import static org.junit.Assert.assertEquals;

public class MailWithAttachmentServiceLiveTest {

    @Resource
    private MailWithAttachmentService emailService;
    private GreenMail greenMail;

    @Before
    public void startMailServer() {
        emailService = new MailWithAttachmentService();
        greenMail = new GreenMail(ServerSetupTest.SMTP);
        greenMail.start();
    }

    @After
    public void stopMailServer() {
        greenMail.stop();
        emailService = null;
    }

    @Test
    public void canSendMail() {
        try {
            Session testSession = greenMail.getSmtp()
                .createSession();
            emailService.sendMail(testSession);
            assertEquals(1, greenMail.getReceivedMessages().length);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
