package Persona;

import Empleado.Medico;

public class CitaMedica {

    private Paciente paciente;
    private Medico medico;
    private String servicio;
    private String fechaConsulta;
    private String horaConsulta;
    private String lugar;

    public CitaMedica(Paciente paciente, Medico medico, String servicio, String fechaConsulta, String horaConsulta, String lugar) {
        this.paciente = paciente;
        this.medico = medico;
        this.servicio = servicio;
        this.fechaConsulta = fechaConsulta;
        this.horaConsulta = horaConsulta;
        this.lugar = lugar;
    }

    public String informacionCitaMedica() {
        String datosCita = "< INFORMACIÓN CITA MEDICA >\n";
        datosCita += "Paciente: " + paciente.getNombre() + "\n";
        datosCita += "Medico: " + medico.getNombre() + "\n";
        datosCita += "Motivo Consulta: " + servicio + "\n";
        datosCita += "Fecha Consulta: " + fechaConsulta + " - Hora: " + horaConsulta + "\n";
        datosCita += "Lugar: " + lugar + "\n";

        return datosCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
