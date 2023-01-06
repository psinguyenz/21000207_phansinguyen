package designpattern.adapter.demo;

public class Filter extends Water{
    private DirtyWater dirtyWater;

    public Filter(DirtyWater dirtyWater) {
        super(dirtyWater.getDirty());
        this.dirtyWater = dirtyWater;
    }

    @Override
    public String getClean() {
        return "clean";
    }
}
