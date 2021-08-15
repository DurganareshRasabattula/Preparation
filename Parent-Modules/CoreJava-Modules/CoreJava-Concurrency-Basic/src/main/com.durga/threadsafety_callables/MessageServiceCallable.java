package threadsafety_callables;


import threadsafety_services.MessageService;

import java.util.concurrent.Callable;

public class MessageServiceCallable implements Callable<String> {
    
    private final MessageService messageService;
    
    public MessageServiceCallable(MessageService messageService) {
        this.messageService = messageService;
    
    }
    
    @Override
    public String call() {
        return messageService.getMesssage();
    }
}
