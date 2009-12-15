
package com.google.code.linkedinapi.schema.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.google.code.linkedinapi.schema.Adapter1;
import com.google.code.linkedinapi.schema.UpdateComment;
import com.google.code.linkedinapi.schema.UpdateComments;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateComment"
})
@XmlRootElement(name = "update-comments")
public class UpdateCommentsImpl
    implements UpdateComments
{

    @XmlElement(name = "update-comment", required = true, type = UpdateCommentImpl.class)
    protected List<UpdateComment> updateComment;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long total;

    public List<UpdateComment> getUpdateComment() {
        if (updateComment == null) {
            updateComment = new ArrayList<UpdateComment>();
        }
        return this.updateComment;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

}