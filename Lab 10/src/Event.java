import java.time.LocalDateTime;

// Defines events that occur in the system
class Event {
    private String type;
    private String details;
    private LocalDateTime timestamp;

    public Event(String type, String details) {
        this.type = type;
        this.details = details;
        this.timestamp = LocalDateTime.now();
    }

    public String getType() { return type; }
    public String getDetails() { return details; }
    public LocalDateTime getTimestamp() { return timestamp; }
}
