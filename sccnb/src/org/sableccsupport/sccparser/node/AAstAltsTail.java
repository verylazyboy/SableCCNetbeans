/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sableccsupport.sccparser.node;

import org.sableccsupport.sccparser.analysis.*;

@SuppressWarnings("nls")
public final class AAstAltsTail extends PAstAltsTail
{
    private TBar _bar_;
    private PAstAlt _astAlt_;

    public AAstAltsTail()
    {
        // Constructor
    }

    public AAstAltsTail(
        @SuppressWarnings("hiding") TBar _bar_,
        @SuppressWarnings("hiding") PAstAlt _astAlt_)
    {
        // Constructor
        setBar(_bar_);

        setAstAlt(_astAlt_);

    }

    @Override
    public Object clone()
    {
        return new AAstAltsTail(
            cloneNode(this._bar_),
            cloneNode(this._astAlt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAstAltsTail(this);
    }

    public TBar getBar()
    {
        return this._bar_;
    }

    public void setBar(TBar node)
    {
        if(this._bar_ != null)
        {
            this._bar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bar_ = node;
    }

    public PAstAlt getAstAlt()
    {
        return this._astAlt_;
    }

    public void setAstAlt(PAstAlt node)
    {
        if(this._astAlt_ != null)
        {
            this._astAlt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._astAlt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._bar_)
            + toString(this._astAlt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._bar_ == child)
        {
            this._bar_ = null;
            return;
        }

        if(this._astAlt_ == child)
        {
            this._astAlt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._bar_ == oldChild)
        {
            setBar((TBar) newChild);
            return;
        }

        if(this._astAlt_ == oldChild)
        {
            setAstAlt((PAstAlt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
