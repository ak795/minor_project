package com.example.goldie.menu.adapters;

/**
 * Created by goldie on 28/03/16.
 */
public class CardItemData
{
    private String m_text1;
    private String m_text2;
    private String m_text3;

    public CardItemData(String text1, String text2, String text3)
    {
        m_text1 = text1;
        m_text2 = text2;
        m_text3 = text3;
    }

    public String getText1()
    {
        return m_text1;
    }

    public String getText2()
    {
        return m_text2;
    }

    public String getText3()
    {
        return m_text3;
    }
}
