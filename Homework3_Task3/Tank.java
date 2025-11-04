public class Tank implements BuildChassis, BuildTracks, BuildTurret {
    @Override
    public void build_turret(){
        System.out.println("The turret is built");
    }

    @Override
    public void build_tracks(){
        System.out.println("The tracks is built");
    }

    @Override
    public void bulid_chassis(){
        System.out.println("The chassis is built");
    }
}
