/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sableccsupport.sccparser.node;

import java.util.*;
import org.sableccsupport.sccparser.analysis.*;

@SuppressWarnings("nls")
public final class AAlt extends PAlt
{
    private PAltName _altName_;
    private final LinkedList<PElem> _elems_ = new LinkedList<PElem>();
    private PAltTransform _altTransform_;

    public AAlt()
    {
        // Constructor
    }

    public AAlt(
        @SuppressWarnings("hiding") PAltName _altName_,
        @SuppressWarnings("hiding") List<PElem> _elems_,
        @SuppressWarnings("hiding") PAltTransform _altTransform_)
    {
        // Constructor
        setAltName(_altName_);

        setElems(_elems_);

        setAltTransform(_altTransform_);

    }

    @Override
    public Object clone()
    {
        return new AAlt(
            cloneNode(this._altName_),
            cloneList(this._elems_),
            cloneNode(this._altTransform_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAlt(this);
    }

    public PAltName getAltName()
    {
        return this._altName_;
    }

    public void setAltName(PAltName node)
    {
        if(this._altName_ != null)
        {
            this._altName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._altName_ = node;
    }

    public LinkedList<PElem> getElems()
    {
        return this._elems_;
    }

    public void setElems(List<PElem> list)
    {
        this._elems_.clear();
        this._elems_.addAll(list);
        for(PElem e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public PAltTransform getAltTransform()
    {
        return this._altTransform_;
    }

    public void setAltTransform(PAltTransform node)
    {
        if(this._altTransform_ != null)
        {
            this._altTransform_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._altTransform_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._altName_)
            + toString(this._elems_)
            + toString(this._altTransform_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._altName_ == child)
        {
            this._altName_ = null;
            return;
        }

        if(this._elems_.remove(child))
        {
            return;
        }

        if(this._altTransform_ == child)
        {
            this._altTransform_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._altName_ == oldChild)
        {
            setAltName((PAltName) newChild);
            return;
        }

        for(ListIterator<PElem> i = this._elems_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PElem) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._altTransform_ == oldChild)
        {
            setAltTransform((PAltTransform) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
