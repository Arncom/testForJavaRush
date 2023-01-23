package com.game.service;

import com.game.controller.PlayerOrder;
import com.game.entity.Player;
import com.game.entity.Profession;
import com.game.entity.Race;
import com.game.exceptions.PlayerNotFoundException;
import com.game.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.game.exceptions.BadRequestException;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Transactional
public interface PlayerService {
    List<Player> getCount(Specification<Player> specification);

    Page<Player> getAllPlayers(Specification<Player> specification, Pageable sortedByName);

    Player createPlayer(Player player);

    Player updatePlayer(String id, Player player);

    Player getPlayer(String id);

    void deletePlayer(String id);

}
