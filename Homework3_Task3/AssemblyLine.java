public interface AssemblyLine {
    public static void assemble_tank(BuildChassis b_ch, BuildTurret b_tu, BuildTracks b_tr){
        b_ch.bulid_chassis();
        b_tu.build_turret();
        b_tr.build_tracks();
        System.out.println("All three parts are assembled");
    }
}
