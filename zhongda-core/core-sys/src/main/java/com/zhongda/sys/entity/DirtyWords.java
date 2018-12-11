package com.zhongda.sys.entity;

import javax.persistence.Table;

import com.zhongda.core.entity.IEntity;

//import com.zhongda.core.entity.IEntity;

@Table(name="dic_dirtywords")
public class DirtyWords implements IEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private Integer id;

    private String dirtyWords;

    private Integer sortIndex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDirtyWords() {
        return dirtyWords;
    }

    public void setDirtyWords(String dirtyWords) {
        this.dirtyWords = dirtyWords == null ? null : dirtyWords.trim();
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }
}
