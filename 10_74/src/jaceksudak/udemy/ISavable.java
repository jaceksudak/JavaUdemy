package jaceksudak.udemy;

import java.util.List;

/**
 * Created by Jacek on 2017-03-28.
 */
public interface ISavable {
    List<String> save();
    void load(List<String> savedValues);
}
