package telas;

import entidades.Campo;
import entidades.Objeto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.ObjetoTableModel;
import utils.Arquivos;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private ObjetoTableModel tabelaObjetos;

    private List<Campo> campos;
    private List<Objeto> objetos;

    public TelaPrincipal() {
        initComponents();
        
        iniciarCampos();
        instanciarCampos();
        
        iniciarObjetos();
        atualizarTabela();
    }
    
    private void atualizarTabela() {
        this.tabelaObjetos = null;
        this.tabelaObjetos = new ObjetoTableModel(this.objetos);
        this.jTableAlgoritmo.setModel(this.tabelaObjetos);
    }
    
    private void iniciarCampos() {
        this.campos = null;
        this.campos = new ArrayList<>();
    }
    
    private void iniciarObjetos() {
        this.objetos = null;
        this.objetos = new ArrayList<>();
    }

    private void instanciarCampos() {
        campos.add(new Campo(0, jTextField1, lblArrow1));
        campos.add(new Campo(1, jTextField2, lblArrow2));
        campos.add(new Campo(2, jTextField3, lblArrow3));
        campos.add(new Campo(3, jTextField4, lblArrow4));
        campos.add(new Campo(4, jTextField5, lblArrow5));
        campos.add(new Campo(5, jTextField6, lblArrow6));
        campos.add(new Campo(6, jTextField7, lblArrow7));
        campos.add(new Campo(7, jTextField8, lblArrow8));
        campos.add(new Campo(8, jTextField9, lblArrow9));
        campos.add(new Campo(9, jTextField10, lblArrow10));
        campos.add(new Campo(10, jTextField11, lblArrow11));
        campos.add(new Campo(11, jTextField12, lblArrow12));
        campos.add(new Campo(12, jTextField13, lblArrow13));
        campos.add(new Campo(13, jTextField14, lblArrow14));
        campos.add(new Campo(14, jTextField15, lblArrow15));
        campos.add(new Campo(15, jTextField16, lblArrow16));
        campos.add(new Campo(16, jTextField17, lblArrow17));
        campos.add(new Campo(17, jTextField18, lblArrow18));
        campos.add(new Campo(18, jTextField19, lblArrow19));
    }
    
    private void setValores(Objeto obj) {
        this.txtEstadoAtual.setText(obj.getEstadoAtual());
        this.txtSimboloLido.setText(obj.getSimboloLido());
        this.txtProxEstado.setText(obj.getProximoEstado());
        this.txtSimbEscrever.setText(obj.getSimboloEscrever());
        this.txtDirecao.setText(obj.getDirecao());
    }
    
    private void limparValores() {
        this.txtEstadoAtual.setText("");
        this.txtSimboloLido.setText("");
        this.txtProxEstado.setText("");
        this.txtSimbEscrever.setText("");
        this.txtDirecao.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelExecucao = new javax.swing.JPanel();
        jButtonExecutarAlgoritmo = new javax.swing.JButton();
        jScrollPanePainelFita = new javax.swing.JScrollPane();
        jPanelFita = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        lblArrow1 = new javax.swing.JLabel();
        lblArrow2 = new javax.swing.JLabel();
        lblArrow3 = new javax.swing.JLabel();
        lblArrow4 = new javax.swing.JLabel();
        lblArrow5 = new javax.swing.JLabel();
        lblArrow6 = new javax.swing.JLabel();
        lblArrow7 = new javax.swing.JLabel();
        lblArrow8 = new javax.swing.JLabel();
        lblArrow9 = new javax.swing.JLabel();
        lblArrow10 = new javax.swing.JLabel();
        lblArrow11 = new javax.swing.JLabel();
        lblArrow12 = new javax.swing.JLabel();
        lblArrow13 = new javax.swing.JLabel();
        lblArrow14 = new javax.swing.JLabel();
        lblArrow15 = new javax.swing.JLabel();
        lblArrow16 = new javax.swing.JLabel();
        lblArrow17 = new javax.swing.JLabel();
        lblArrow18 = new javax.swing.JLabel();
        lblArrow19 = new javax.swing.JLabel();
        jButtonLimparFita = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEstadoAtual = new javax.swing.JTextField();
        txtSimboloLido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProxEstado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSimbEscrever = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDirecao = new javax.swing.JTextField();
        cmbSegundos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanelAlgoritmo = new javax.swing.JPanel();
        jScrollPaneTabelaAlgoritmo = new javax.swing.JScrollPane();
        jTableAlgoritmo = new javax.swing.JTable();
        jButtonGravarAlgoritmo = new javax.swing.JButton();
        jButtonAddLinha = new javax.swing.JButton();
        jButtonRemoveLinha = new javax.swing.JButton();
        jButtonBaixar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Máquina de Turing");

        jPanelExecucao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Fita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jButtonExecutarAlgoritmo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/run.png"))); // NOI18N
        jButtonExecutarAlgoritmo.setToolTipText("Executar algoritmo");
        jButtonExecutarAlgoritmo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExecutarAlgoritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExecutarAlgoritmoActionPerformed(evt);
            }
        });

        jScrollPanePainelFita.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPanePainelFita.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanelFita.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelFita.setName(""); // NOI18N
        jPanelFita.setPreferredSize(new java.awt.Dimension(643, 50));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText(">");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblArrow1.setBackground(new java.awt.Color(255, 255, 255));
        lblArrow1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow1.setFocusable(false);

        lblArrow2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow2.setFocusable(false);

        lblArrow3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow3.setFocusable(false);

        lblArrow4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow4.setFocusable(false);

        lblArrow5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow5.setFocusable(false);

        lblArrow6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow6.setFocusable(false);

        lblArrow7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow7.setFocusable(false);

        lblArrow8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow8.setFocusable(false);

        lblArrow9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow9.setFocusable(false);

        lblArrow10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow10.setFocusable(false);

        lblArrow11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow11.setFocusable(false);

        lblArrow12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow12.setFocusable(false);

        lblArrow13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow13.setFocusable(false);

        lblArrow14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow14.setFocusable(false);

        lblArrow15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow15.setFocusable(false);

        lblArrow16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow16.setFocusable(false);

        lblArrow17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow17.setFocusable(false);

        lblArrow18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow18.setFocusable(false);

        lblArrow19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/down-arrow.png"))); // NOI18N
        lblArrow19.setFocusable(false);

        javax.swing.GroupLayout jPanelFitaLayout = new javax.swing.GroupLayout(jPanelFita);
        jPanelFita.setLayout(jPanelFitaLayout);
        jPanelFitaLayout.setHorizontalGroup(
            jPanelFitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblArrow1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrow18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblArrow19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelFitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFitaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelFitaLayout.setVerticalGroup(
            jPanelFitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFitaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblArrow19)
                    .addComponent(lblArrow18)
                    .addComponent(lblArrow17)
                    .addComponent(lblArrow16)
                    .addComponent(lblArrow15)
                    .addComponent(lblArrow14)
                    .addComponent(lblArrow13)
                    .addComponent(lblArrow12)
                    .addComponent(lblArrow11)
                    .addComponent(lblArrow10)
                    .addComponent(lblArrow9)
                    .addComponent(lblArrow8)
                    .addComponent(lblArrow7)
                    .addComponent(lblArrow6)
                    .addComponent(lblArrow5)
                    .addComponent(lblArrow4)
                    .addComponent(lblArrow3)
                    .addComponent(lblArrow2)
                    .addComponent(lblArrow1))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(jPanelFitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFitaLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(jPanelFitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jScrollPanePainelFita.setViewportView(jPanelFita);

        jButtonLimparFita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/clear.png"))); // NOI18N
        jButtonLimparFita.setToolTipText("Limpar fita");
        jButtonLimparFita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLimparFita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparFitaActionPerformed(evt);
            }
        });

        jLabel1.setText("Estado Atual");

        jLabel2.setText("Simbolo Lido");

        txtEstadoAtual.setEditable(false);

        txtSimboloLido.setEditable(false);

        jLabel3.setText("Próx. Estado");

        txtProxEstado.setEditable(false);

        jLabel4.setText("Simb. Escrever");

        txtSimbEscrever.setEditable(false);

        jLabel5.setText("Direção");

        txtDirecao.setEditable(false);

        cmbSegundos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
        cmbSegundos.setFocusable(false);

        jLabel6.setText("Velocidade");

        javax.swing.GroupLayout jPanelExecucaoLayout = new javax.swing.GroupLayout(jPanelExecucao);
        jPanelExecucao.setLayout(jPanelExecucaoLayout);
        jPanelExecucaoLayout.setHorizontalGroup(
            jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                        .addGroup(jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstadoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSimboloLido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                                .addComponent(txtSimbEscrever, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonExecutarAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonLimparFita, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                                .addComponent(txtProxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExecucaoLayout.createSequentialGroup()
                        .addComponent(jScrollPanePainelFita, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                        .addGap(10, 10, 10))))
        );
        jPanelExecucaoLayout.setVerticalGroup(
            jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPanePainelFita, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtEstadoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtProxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonLimparFita, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExecutarAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                .addGroup(jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel2))
                    .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(txtSimboloLido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel4))
                    .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(txtSimbEscrever, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        jPanelAlgoritmo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Entrada de Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTableAlgoritmo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estado Atual", "Simbolo Lido", "Proximo Estado", "Simbolo Escrever", "Direção"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableAlgoritmo.getTableHeader().setReorderingAllowed(false);
        jScrollPaneTabelaAlgoritmo.setViewportView(jTableAlgoritmo);
        if (jTableAlgoritmo.getColumnModel().getColumnCount() > 0) {
            jTableAlgoritmo.getColumnModel().getColumn(0).setResizable(false);
            jTableAlgoritmo.getColumnModel().getColumn(1).setResizable(false);
            jTableAlgoritmo.getColumnModel().getColumn(2).setResizable(false);
            jTableAlgoritmo.getColumnModel().getColumn(4).setResizable(false);
        }

        jButtonGravarAlgoritmo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/save.png"))); // NOI18N
        jButtonGravarAlgoritmo.setToolTipText("Gravar algoritmo");
        jButtonGravarAlgoritmo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGravarAlgoritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarAlgoritmoActionPerformed(evt);
            }
        });

        jButtonAddLinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        jButtonAddLinha.setToolTipText("Adicionar linha");
        jButtonAddLinha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddLinhaActionPerformed(evt);
            }
        });

        jButtonRemoveLinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remove.png"))); // NOI18N
        jButtonRemoveLinha.setToolTipText("Remover linha");
        jButtonRemoveLinha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRemoveLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveLinhaActionPerformed(evt);
            }
        });

        jButtonBaixar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/baixar.png"))); // NOI18N
        jButtonBaixar.setToolTipText("Importar algoritimo");
        jButtonBaixar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBaixar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBaixarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAlgoritmoLayout = new javax.swing.GroupLayout(jPanelAlgoritmo);
        jPanelAlgoritmo.setLayout(jPanelAlgoritmoLayout);
        jPanelAlgoritmoLayout.setHorizontalGroup(
            jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlgoritmoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTabelaAlgoritmo, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlgoritmoLayout.createSequentialGroup()
                        .addComponent(jButtonBaixar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGravarAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoveLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelAlgoritmoLayout.setVerticalGroup(
            jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlgoritmoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonBaixar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGravarAlgoritmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddLinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRemoveLinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTabelaAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelAlgoritmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelExecucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelExecucao, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanelAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGravarAlgoritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarAlgoritmoActionPerformed
        this.objetos = null;
        this.objetos = this.tabelaObjetos.getListaObjetos();
        
        Arquivos.salvarArquivoDialog(this, objetos);
    }//GEN-LAST:event_jButtonGravarAlgoritmoActionPerformed

    private void jButtonExecutarAlgoritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExecutarAlgoritmoActionPerformed
        this.objetos = null;
        this.objetos = this.tabelaObjetos.getListaObjetos();
        
        Object o = cmbSegundos.getSelectedItem();
        int vel = (int) Float.parseFloat((String) o) * 1000;
        
        if (!this.objetos.isEmpty()) {
            new Thread() {
                
                @Override
                public void run() {
                    boolean parou = false;
                    String estadoAtual = ">";
                    int posicaoAtual = 0;

                    while (!parou) {
                        Campo campo = getCampoPorPosicao(posicaoAtual);
                        campo.setCor(Color.GREEN);
                        //campo.setArrowVisible(true);

                        if (campo.getTexto().isEmpty()) {
                            campo.setTexto(" ");
                        }

                        //System.out.println("Estado atual = " + estadoAtual + "Campo texto = "+ campo.getTextField().getText());;
                        Objeto obj = getObjeto(estadoAtual, campo);
                        setValores(obj);

                        if (obj == null) {
                            JOptionPane.showMessageDialog(null, "Algorítimo incorreto", "ERRO", JOptionPane.ERROR_MESSAGE);
                            campo.setCor(Color.white);
                            //campo.setArrowVisible(false);
                            break;
                        }

                        estadoAtual = obj.getProximoEstado();
                        campo.setTexto(obj.getSimboloEscrever());

                        switch (obj.getDirecao()) {
                            case "D":
                                posicaoAtual++;
                                break;
                            case "E":
                                posicaoAtual--;
                                break;
                            default:
                                parou = true;
                                break;
                        }

                        try {
                            Thread.sleep(vel);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        campo.setCor(Color.white);
                        //campo.setArrowVisible(false);
                    }

                    limparValores();
                    JOptionPane.showMessageDialog(null, "Finalizado");
                }
            }.start();
        } else {
            JOptionPane.showMessageDialog(null, "Informe um algoritmo!");
        }
    }//GEN-LAST:event_jButtonExecutarAlgoritmoActionPerformed

    private void jButtonAddLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddLinhaActionPerformed
        this.objetos.add(new Objeto());
        atualizarTabela();
    }//GEN-LAST:event_jButtonAddLinhaActionPerformed

    private void jButtonRemoveLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveLinhaActionPerformed
        if (jTableAlgoritmo.getSelectedRow() != -1) {
            this.objetos.remove(jTableAlgoritmo.getSelectedRow());
            atualizarTabela();
        }
    }//GEN-LAST:event_jButtonRemoveLinhaActionPerformed

    private void jButtonLimparFitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparFitaActionPerformed
        this.campos.forEach((c) -> {
            if (c.getPosicao() == 0) {
                c.setTexto(">");
            } else {
                c.setTexto("");
            }
        });
    }//GEN-LAST:event_jButtonLimparFitaActionPerformed

    private void jButtonBaixarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBaixarActionPerformed
        limparTabela();

        String caminhoArquivo = Arquivos.abrirArquivoDialog(this);
        if (caminhoArquivo == null) {
            return;
        }
 
        try (Scanner scan = new Scanner(Arquivos.lerArquivo(caminhoArquivo))) {
            while (scan.hasNextLine()) {
                String[] linhaSplit = scan.nextLine().split(";");
                this.objetos.add(new Objeto(linhaSplit[0], linhaSplit[1],
                    linhaSplit[2], linhaSplit[3], linhaSplit[4]));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique se o tipo do arquivo esta correto\n"
                    + "Exemplo : 0;0;0;0;0", "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            atualizarTabela();
        }
    }//GEN-LAST:event_jButtonBaixarActionPerformed

    private Campo getCampoPorPosicao(int pos) {
        for (Campo c : this.campos) {
            if (c.getPosicao() == pos) {
                return c;
            }
        }
        return null;
    }

    private Objeto getObjeto(String estadoAtual, Campo campo) {
        for (Objeto obj : this.objetos) {
            if (estadoAtual.equals(obj.getEstadoAtual())
                    && campo.getTextField().getText().equals((obj.getSimboloLido()))) {

                return obj;
            }
        }

        return null;
    }

    private void limparTabela() {
        iniciarObjetos();
        atualizarTabela();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbSegundos;
    private javax.swing.JButton jButtonAddLinha;
    private javax.swing.JButton jButtonBaixar;
    private javax.swing.JButton jButtonExecutarAlgoritmo;
    private javax.swing.JButton jButtonGravarAlgoritmo;
    private javax.swing.JButton jButtonLimparFita;
    private javax.swing.JButton jButtonRemoveLinha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelAlgoritmo;
    private javax.swing.JPanel jPanelExecucao;
    private javax.swing.JPanel jPanelFita;
    private javax.swing.JScrollPane jScrollPanePainelFita;
    private javax.swing.JScrollPane jScrollPaneTabelaAlgoritmo;
    private javax.swing.JTable jTableAlgoritmo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblArrow1;
    private javax.swing.JLabel lblArrow10;
    private javax.swing.JLabel lblArrow11;
    private javax.swing.JLabel lblArrow12;
    private javax.swing.JLabel lblArrow13;
    private javax.swing.JLabel lblArrow14;
    private javax.swing.JLabel lblArrow15;
    private javax.swing.JLabel lblArrow16;
    private javax.swing.JLabel lblArrow17;
    private javax.swing.JLabel lblArrow18;
    private javax.swing.JLabel lblArrow19;
    private javax.swing.JLabel lblArrow2;
    private javax.swing.JLabel lblArrow3;
    private javax.swing.JLabel lblArrow4;
    private javax.swing.JLabel lblArrow5;
    private javax.swing.JLabel lblArrow6;
    private javax.swing.JLabel lblArrow7;
    private javax.swing.JLabel lblArrow8;
    private javax.swing.JLabel lblArrow9;
    private javax.swing.JTextField txtDirecao;
    private javax.swing.JTextField txtEstadoAtual;
    private javax.swing.JTextField txtProxEstado;
    private javax.swing.JTextField txtSimbEscrever;
    private javax.swing.JTextField txtSimboloLido;
    // End of variables declaration//GEN-END:variables
}
