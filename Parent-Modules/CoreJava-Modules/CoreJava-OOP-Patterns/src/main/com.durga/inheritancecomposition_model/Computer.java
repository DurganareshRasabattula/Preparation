package inheritancecomposition_model;

import java.util.Optional;

/**
 * @author durga on 8/12/2021
 */
public class Computer {
    private final Processor processor;
    private final Memory memory;
    private SoundCard soundCard;

    public Computer(Processor processor, Memory memory) {
        this.processor = processor;
        this.memory = memory;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Optional<SoundCard> getSoundCard() {
        return Optional.ofNullable(soundCard);
    }

    @Override
    public String toString() {
        return "Computer{" + "processor=" + processor + ", memory=" + memory + ", soundcard=" + soundCard +"}";
    }
}
