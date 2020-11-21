package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * t_admin
 * @author 
 */
@Data
public class TAdmin implements Serializable {
    private Integer id;

    private String loginAcct;

    private String userPswd;

    private String userName;

    private String email;

    private String createTime;

    private static final long serialVersionUID = 1L;
}