package memorias.arrays.comp;

public class InfoDormi {

    private String name;
    private String email;

    private int rom;

    public InfoDormi(String name, String email, int rom){
        this.name = name;
        this.email = email;
        this.rom = rom;
    }

    public String getName(){ return name; }

    public void setName(String name){ this.name = name; }

    public String getEmail(){ return email; }

    public void setEmail(String email){ this.email = email; }

    public int getRom(){ return rom; }

    public void setRom(int rom){ this.rom = rom; }


}
