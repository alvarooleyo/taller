package vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class vista extends javax.swing.JFrame {

    /**
     * Creates new form vista
     */
    public vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoAveria = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMotivo = new javax.swing.JTextArea();
        dialogoRecepcion = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtModeloNuevo = new javax.swing.JTextField();
        txtMarcaNuevo = new javax.swing.JTextField();
        txtMatriculaNuevo = new javax.swing.JTextField();
        txtNombreNuevo = new javax.swing.JTextField();
        txtDniNuevo = new javax.swing.JTextField();
        btnValidar1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaMotivoNuevo = new javax.swing.JTextArea();
        dialogoMotivo = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaMotivo = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        frameInicio = new javax.swing.JFrame();
        panelInicio = new javax.swing.JPanel();
        btnEntregar = new javax.swing.JButton();
        btnExistentes = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        panelPrograma = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaExistentes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnAveria = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        panelEntrega = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaEntrega = new javax.swing.JTable();
        btnEntrega = new javax.swing.JButton();
        btnAtras2 = new javax.swing.JButton();
        txtId2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();

        jLabel9.setText("Por favor, indique el motivo por el que el coche visita el taller.");

        txtMotivo.setColumns(20);
        txtMotivo.setRows(5);
        txtMotivo.setEnabled(false);
        jScrollPane1.setViewportView(txtMotivo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogoAveriaLayout = new javax.swing.GroupLayout(dialogoAveria.getContentPane());
        dialogoAveria.getContentPane().setLayout(dialogoAveriaLayout);
        dialogoAveriaLayout.setHorizontalGroup(
            dialogoAveriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoAveriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogoAveriaLayout.setVerticalGroup(
            dialogoAveriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoAveriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        dialogoRecepcion.setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel10.setFont(new java.awt.Font("Engravers MT", 3, 18)); // NOI18N
        jLabel10.setText("AÑADIR NUEVO VEHICULO");

        jLabel11.setText("VEHÍCULO");

        jLabel12.setText("Marca: ");

        jLabel13.setText("Modelo: ");

        jLabel14.setText("Matrícula: ");

        jLabel15.setText("CLIENTE");

        jLabel16.setText("Nombre: ");

        jLabel17.setText("Dni: ");

        txtModeloNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloNuevoActionPerformed(evt);
            }
        });

        btnValidar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconovalidar.png"))); // NOI18N
        btnValidar1.setText("VALIDAR");

        jLabel18.setText("Motivo/averia: ");

        txtAreaMotivoNuevo.setColumns(20);
        txtAreaMotivoNuevo.setRows(5);
        jScrollPane4.setViewportView(txtAreaMotivoNuevo);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtMatriculaNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(txtModeloNuevo)
                                            .addComponent(txtMarcaNuevo))
                                        .addGap(109, 109, 109))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDniNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(txtNombreNuevo))
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(209, 209, 209))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4)))
                .addGap(132, 132, 132))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(btnValidar1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16)
                    .addComponent(txtMarcaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17)
                    .addComponent(txtModeloNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDniNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtMatriculaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnValidar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogoRecepcionLayout = new javax.swing.GroupLayout(dialogoRecepcion.getContentPane());
        dialogoRecepcion.getContentPane().setLayout(dialogoRecepcionLayout);
        dialogoRecepcionLayout.setHorizontalGroup(
            dialogoRecepcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoRecepcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogoRecepcionLayout.setVerticalGroup(
            dialogoRecepcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoRecepcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtAreaMotivo.setColumns(20);
        txtAreaMotivo.setRows(5);
        txtAreaMotivo.setEnabled(false);
        jScrollPane3.setViewportView(txtAreaMotivo);

        jLabel8.setText("Averias/motivos de la entrada del coche en el taller: ");

        javax.swing.GroupLayout dialogoMotivoLayout = new javax.swing.GroupLayout(dialogoMotivo.getContentPane());
        dialogoMotivo.getContentPane().setLayout(dialogoMotivoLayout);
        dialogoMotivoLayout.setHorizontalGroup(
            dialogoMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoMotivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(dialogoMotivoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        dialogoMotivoLayout.setVerticalGroup(
            dialogoMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoMotivoLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        frameInicio.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cocheblanco.png"))); // NOI18N
        btnEntregar.setBorderPainted(false);
        btnEntregar.setContentAreaFilled(false);
        panelInicio.add(btnEntregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, 40));

        btnExistentes.setBackground(new java.awt.Color(0, 0, 0));
        btnExistentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/parking.png"))); // NOI18N
        btnExistentes.setBorderPainted(false);
        btnExistentes.setContentAreaFilled(false);
        panelInicio.add(btnExistentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 50, 40));

        btnAgregar.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoagregar.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        panelInicio.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, 40));

        jLabel24.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Entrega");
        panelInicio.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jLabel23.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("EXISTENTES");
        panelInicio.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        jLabel22.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("AGREGAR");
        panelInicio.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gasmonkey.gif"))); // NOI18N
        jLabel20.setText("AGREGAR");
        panelInicio.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 600, 380));
        panelInicio.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setOpaque(true);
        panelInicio.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 380));

        getContentPane().add(panelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tablaExistentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MATRICULA", "MARCA", "MODELO", "NOMBRE PROP", "DNI PROP", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaExistentes);
        if (tablaExistentes.getColumnModel().getColumnCount() > 0) {
            tablaExistentes.getColumnModel().getColumn(0).setResizable(false);
            tablaExistentes.getColumnModel().getColumn(1).setResizable(false);
            tablaExistentes.getColumnModel().getColumn(2).setResizable(false);
            tablaExistentes.getColumnModel().getColumn(3).setResizable(false);
            tablaExistentes.getColumnModel().getColumn(4).setResizable(false);
            tablaExistentes.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setText("Vehículos en proceso de reparación");

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconomodificar.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoeliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre Propietario: ");

        jLabel3.setText("Marca: ");

        jLabel4.setText("DNI: ");

        jLabel5.setText("Modelo: ");

        jLabel6.setText("Matricula: ");

        jLabel7.setText("ID: ");

        txtId.setEnabled(false);

        btnAveria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconollave.png"))); // NOI18N
        btnAveria.setText("VER AVERIAS");

        btnLimpiar.setText("Limpiar");

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.jpg"))); // NOI18N

        javax.swing.GroupLayout panelProgramaLayout = new javax.swing.GroupLayout(panelPrograma);
        panelPrograma.setLayout(panelProgramaLayout);
        panelProgramaLayout.setHorizontalGroup(
            panelProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProgramaLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(panelProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProgramaLayout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1))
                    .addGroup(panelProgramaLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProgramaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProgramaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnAveria)
                        .addGap(70, 70, 70)
                        .addComponent(btnModificar)
                        .addGap(52, 52, 52)
                        .addComponent(btnEliminar))
                    .addGroup(panelProgramaLayout.createSequentialGroup()
                        .addGroup(panelProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelProgramaLayout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar))
                            .addGroup(panelProgramaLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 56, Short.MAX_VALUE))
        );
        panelProgramaLayout.setVerticalGroup(
            panelProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProgramaLayout.createSequentialGroup()
                .addGroup(panelProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProgramaLayout.createSequentialGroup()
                        .addGap(0, 44, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(panelProgramaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProgramaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addGroup(panelProgramaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProgramaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3))
                    .addGroup(panelProgramaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(panelProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProgramaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panelProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addGap(14, 14, 14)
                .addGroup(panelProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnLimpiar))
                .addGap(16, 16, 16)
                .addGroup(panelProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAveria)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        getContentPane().add(panelPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 380));

        tablaEntrega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tablaEntrega);

        btnEntrega.setText("ENTREGA");

        btnAtras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.jpg"))); // NOI18N

        jLabel25.setText("Id: ");

        javax.swing.GroupLayout panelEntregaLayout = new javax.swing.GroupLayout(panelEntrega);
        panelEntrega.setLayout(panelEntregaLayout);
        panelEntregaLayout.setHorizontalGroup(
            panelEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addGroup(panelEntregaLayout.createSequentialGroup()
                .addComponent(btnAtras2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelEntregaLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addGroup(panelEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtId2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEntregaLayout.setVerticalGroup(
            panelEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntregaLayout.createSequentialGroup()
                .addComponent(btnAtras2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnEntrega)
                .addGap(76, 76, 76))
        );

        getContentPane().add(panelEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtModeloNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloNuevoActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnAtras;
    public javax.swing.JButton btnAtras2;
    public javax.swing.JButton btnAveria;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnEntrega;
    public javax.swing.JButton btnEntregar;
    public javax.swing.JButton btnExistentes;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnValidar1;
    public javax.swing.JDialog dialogoAveria;
    public javax.swing.JDialog dialogoMotivo;
    public javax.swing.JDialog dialogoRecepcion;
    public javax.swing.JFrame frameInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JPanel panelEntrega;
    public javax.swing.JPanel panelInicio;
    public javax.swing.JPanel panelPrograma;
    public javax.swing.JTable tablaEntrega;
    public javax.swing.JTable tablaExistentes;
    public javax.swing.JTextArea txtAreaMotivo;
    public javax.swing.JTextArea txtAreaMotivoNuevo;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtDniNuevo;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtId2;
    public javax.swing.JTextField txtMarca;
    public javax.swing.JTextField txtMarcaNuevo;
    public javax.swing.JTextField txtMatricula;
    public javax.swing.JTextField txtMatriculaNuevo;
    public javax.swing.JTextField txtModelo;
    public javax.swing.JTextField txtModeloNuevo;
    public javax.swing.JTextArea txtMotivo;
    public javax.swing.JTextField txtNombreNuevo;
    public javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
