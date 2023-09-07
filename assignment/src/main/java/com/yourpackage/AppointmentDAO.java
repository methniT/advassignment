package com.yourpackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AppointmentDAO {
    // Implement CRUD operations for appointments

    public void AddAppointment(Appointment appointment) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO appointments (id, date, time, consultant) VALUES (?, ?, ?, ?)")) {
            stmt.setInt(1, appointment.getId());
            stmt.setString(2, appointment.getDate());
            stmt.setString(3, appointment.getTime());
            stmt.setString(4, appointment.getConsultant());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Appointment> getAppointmentsForConsultant(int consultantId) {
        List<Appointment> appointments = new ArrayList<>();
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "SELECT * FROM appointments WHERE consultant_id = ?")) {
            stmt.setInt(1, consultantId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Appointment appointment = new Appointment();
                appointment.setId(rs.getInt("appointment_id"));
                appointment.setDate(rs.getInt("consultant_id"));
                appointment.setTime(rs.getInt("user_id"));
                appointment.setConsultant(rs.getString("appointment_date"));
                appointments.add(appointment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointments;
    }

    // Other CRUD methods for updating, retrieving, and deleting appointments
}
