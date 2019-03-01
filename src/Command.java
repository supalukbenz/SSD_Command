public abstract class Command {

    private int tick; // record tick
    private Player player;

    public Command(int tick, Player player) {
        this.tick = tick;
        this.player = player;
    }

    public int getTick() {
        return tick;
    }

    public Player getPlayer() {
        return player;
    }

    public abstract void execute();
}
