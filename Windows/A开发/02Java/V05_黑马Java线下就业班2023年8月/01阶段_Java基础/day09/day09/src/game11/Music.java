package game11;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*
    音乐类
        1.在模块下创建lib包保存
            jl-1.0.1.jar -> 右键 Add As Lib...添加到依赖
        2.在模块下创建Music包保存mp3文件
*/
public class Music {
    public Music() throws FileNotFoundException, JavaLayerException {
        //关联mp3文件, 最后一个字符串中的数据可以改
        String str = System.getProperty("user.dir") + "/day09/Music/music.mp3";
        BufferedInputStream name = new BufferedInputStream(new FileInputStream(str));
        //根据读取的文件, 初始化Player类
        Player player = new Player(name);
        //调用播放的方法
        player.play();
    }
}
