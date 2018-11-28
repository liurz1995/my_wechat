/**
 * FileName: WechatResult
 * Author:   Phil
 * Date:     11/27/2018 10:44 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.phil.modules.result;

import com.phil.modules.util.XmlUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Phil
 * @create 11/27/2018 10:44 PM
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class WechatResult implements Serializable {

    private static final long serialVersionUID = -1470168749001663805L;

    //需要返回的bean
    private Object response;

    //成功与否
    private boolean success;

    //是否是xml
    private boolean xml;

    public String toXml() {
        if (response == null) {
            return "error";
        }
        return XmlUtil.toXml(response);
    }
}