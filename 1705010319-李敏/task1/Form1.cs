using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace 计算软硬件成本变化趋势
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void Button1_Click(object sender, EventArgs e)
        {
            double y, m;
            int M;
            y = double.Parse(textBox1.Text);
            m = 4080 * Math.Exp(0.28 * (y - 1960));
            M = (int)m;
            this.textBox5.Text = M.ToString();
        }

        private void Label11_Click(object sender, EventArgs e)
        {

        }

        private void Label1_Click(object sender, EventArgs e)
        {

        }

        private void Label2_Click(object sender, EventArgs e)
        {

        }

        private void Label3_Click(object sender, EventArgs e)
        {

        }

        private void Label4_Click(object sender, EventArgs e)
        {

        }

        private void TextBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void TextBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void TextBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void TextBox4_TextChanged(object sender, EventArgs e)
        {

        }

        private void Label12_Click(object sender, EventArgs e)
        {

        }

        private void Button2_Click(object sender, EventArgs e)
        {
            double m,q,l;
            int y;
            l = double.Parse(textBox2.Text);
            y = int.Parse(textBox1.Text);
            m = 4080 * Math.Exp(0.28 * (y - 1960));
            q = 0.3 * Math.Pow(0.72, (y - 1974))*l*m;
            this.textBox6.Text = q.ToString();
        }

        private void Button3_Click(object sender, EventArgs e)
        {
            double y, m,zl,yx,cb;
            yx = double.Parse(textBox3.Text);
            zl = double.Parse(textBox4.Text);
            y = double.Parse(textBox1.Text);
            m = 4080 * Math.Exp(0.28 * (y - 1960));
            cb = m / zl * yx / 30;
            this.textBox7.Text = cb.ToString();
        }

        private void Label9_Click(object sender, EventArgs e)
        {

        }

        private void Label13_Click(object sender, EventArgs e)
        {

        }

        private void Label5_Click(object sender, EventArgs e)
        {

        }

        private void Label6_Click(object sender, EventArgs e)
        {

        }

        private void Label7_Click(object sender, EventArgs e)
        {

        }

        private void Label10_Click(object sender, EventArgs e)
        {

        }

        private void TextBox5_TextChanged(object sender, EventArgs e)
        {

        }

        private void TextBox6_TextChanged(object sender, EventArgs e)
        {

        }

        private void TextBox7_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
