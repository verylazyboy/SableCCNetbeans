/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sableccsupport.scclexer.node;

import java.util.*;
import org.sableccsupport.scclexer.analysis.*;

@SuppressWarnings("nls")
public final class ATokens extends PTokens
{
    private final LinkedList<PTokenDef> _tokenDefs_ = new LinkedList<PTokenDef>();

    public ATokens()
    {
        // Constructor
    }

    public ATokens(
        @SuppressWarnings("hiding") List<PTokenDef> _tokenDefs_)
    {
        // Constructor
        setTokenDefs(_tokenDefs_);

    }

    @Override
    public Object clone()
    {
        return new ATokens(
            cloneList(this._tokenDefs_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATokens(this);
    }

    public LinkedList<PTokenDef> getTokenDefs()
    {
        return this._tokenDefs_;
    }

    public void setTokenDefs(List<PTokenDef> list)
    {
        this._tokenDefs_.clear();
        this._tokenDefs_.addAll(list);
        for(PTokenDef e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tokenDefs_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tokenDefs_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PTokenDef> i = this._tokenDefs_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PTokenDef) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
