package se.stadafint.nicecleaning_backend.dto;

public record CleanResponseDTO(
        // ID på städningen
        int id,
        // Datum och tid på städningen
        String date,
        String time,
        // Valfria meddelandet
        String optionalMessage,
        // Statusen på den. Bekräftad, obekräftad, osv.
        int status,
        // Vem som bokade den. Ska bytas ut mot vem städaren är i slutändan
        int appUserId) {

}