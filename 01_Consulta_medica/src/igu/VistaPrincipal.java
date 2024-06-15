/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igu;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author yonathanancheogonzalez
 */
public class VistaPrincipal {
    private JFrame vistaPrincipal;
    private JPanel conteniJPanel, botoneraJPanel;
    private JButton pacienteBtn, medicoBtn, especialidadesBtn, diagnosticoBtn, atencionesBtn;

    public VistaPrincipal() {
        vistaPrincipal = new JFrame("Menú");
        vistaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vistaPrincipal.setSize(400,400);
        conteniJPanel = new JPanel(new BorderLayout());
        vistaPrincipal.add(conteniJPanel);
        
        // zona central
        pacienteBtn = new JButton("Pacientes");
        medicoBtn = new JButton("Medico");
        especialidadesBtn = new JButton("Especialidades");
        diagnosticoBtn = new JButton("Diagnosticos");
        atencionesBtn = new JButton("Atenciones");
        
        botoneraJPanel = new JPanel(new GridLayout(5,1));
        botoneraJPanel.add(pacienteBtn);
        botoneraJPanel.add(medicoBtn);
        botoneraJPanel.add(especialidadesBtn);
        botoneraJPanel.add(diagnosticoBtn);
        botoneraJPanel.add(atencionesBtn);
        
        conteniJPanel.add(botoneraJPanel);
    }

    public void setVisible(boolean opcion) {
        vistaPrincipal.setVisible(opcion);
    }

    public JFrame getVistaPrincipal() {
        return vistaPrincipal;
    }

    public void setVistaPrincipal(JFrame vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
    }

    public JPanel getConteniJPanel() {
        return conteniJPanel;
    }

    public void setConteniJPanel(JPanel conteniJPanel) {
        this.conteniJPanel = conteniJPanel;
    }

    public JPanel getBotoneraJPanel() {
        return botoneraJPanel;
    }

    public void setBotoneraJPanel(JPanel botoneraJPanel) {
        this.botoneraJPanel = botoneraJPanel;
    }

    public JButton getPacienteBtn() {
        return pacienteBtn;
    }

    public void setPacienteBtn(JButton pacienteBtn) {
        this.pacienteBtn = pacienteBtn;
    }

    public JButton getMedicoBtn() {
        return medicoBtn;
    }

    public void setMedicoBtn(JButton medicoBtn) {
        this.medicoBtn = medicoBtn;
    }

    public JButton getEspecialidadesBtn() {
        return especialidadesBtn;
    }

    public void setEspecialidadesBtn(JButton especialidadesBtn) {
        this.especialidadesBtn = especialidadesBtn;
    }

    public JButton getDiagnosticoBtn() {
        return diagnosticoBtn;
    }

    public void setDiagnosticoBtn(JButton diagnosticoBtn) {
        this.diagnosticoBtn = diagnosticoBtn;
    }

    public JButton getAtencionesBtn() {
        return atencionesBtn;
    }

    public void setAtencionesBtn(JButton atencionesBtn) {
        this.atencionesBtn = atencionesBtn;
    }
    
    
    
}
