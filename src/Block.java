import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    public String data;
    public long timeStamp; //milliseconds since 1/1/1970

    //Block Constructor
    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    //Calculates the hash of the block
    public String calculateHash() {
        String calculatedhash = StringUtil.applySha256(
                previousHash +
                        Long.toString(timeStamp) +
                        data
        );
        return calculatedhash;
    }
}
