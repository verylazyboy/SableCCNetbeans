/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.node;

import org.sablecc.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ACharChar extends PChar
{
    private TChar _char_;

    public ACharChar()
    {
        // Constructor
    }

    public ACharChar(
        @SuppressWarnings("hiding") TChar _char_)
    {
        // Constructor
        setChar(_char_);

    }

    @Override
    public Object clone()
    {
        return new ACharChar(
            cloneNode(this._char_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACharChar(this);
    }

    public TChar getChar()
    {
        return this._char_;
    }

    public void setChar(TChar node)
    {
        if(this._char_ != null)
        {
            this._char_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._char_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._char_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._char_ == child)
        {
            this._char_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._char_ == oldChild)
        {
            setChar((TChar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
