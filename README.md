Individual Team: Neelima Chowdhury
Project goals/tasks to be completed:
 1. Core Functionalities
   - Search Functionality: Implement backend integration to allow users to search for veterinarians by city or pincode, with accurate and responsive search results.
   - Filtering Options:
     - Filter by Distance: Implement logic to sort and filter veterinarians based on their proximity to the user.
     - Filter by Average Pricing: Add a feature to sort or filter results by price to show affordable options.
     - Filter by Rating: Allow users to filter the list of vets by user ratings and reviews.
   - Vet Details Page: Complete the vet details view with comprehensive information such as:
     - Name, contact details, and address.
     - Available services and specialties.
     - User reviews and ratings.
   - User Reviews Integration: Implement a system to display user reviews from trusted platforms or allow users to leave reviews directly in the app.

 2. State Management
   - Implement proper state management to handle app states (pause/resume) to ensure the user’s data, filters, and navigation state persist.
   - Use Jetpack `ViewModel` or other state management solutions to maintain UI state across configuration changes and app suspensions.

 3. Database Integration
   - Integrate a database (e.g., Firebase Firestore or SQLite) to store data about veterinarians, user reviews, and search history.
   - Ensure that the data structure supports queries based on location, price, and ratings.

 4. Backend Services
   - Set up a backend service (Node.js, Python, or a serverless function) to manage and serve data to the app.
   - Create APIs for search queries, filters, and vet detail retrieval.
   - Implement data scraping or integration from trusted vet directory APIs (e.g., public veterinary directories).

 5. User Authentication (Optional)
   - Decide if user accounts are needed for additional features (e.g., favoriting vets, reviewing).
   - Implement a basic authentication system using Firebase Authentication or another secure method.
   - Ensure data privacy and security measures are in place, in compliance with local regulations.

 6. User Interface Enhancements
   - Design and implement a polished UI/UX to improve user interaction and retention.
   - Add visual elements such as icons, images, and animations for a better experience.
   - Optimize the UI for both portrait and landscape orientations.
